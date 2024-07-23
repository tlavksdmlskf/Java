package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class FactoryCam extends Camera{
    Detectable detectable;
    Reportable reportable;
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    public void setDetector(Detectable detector){
        detectable = detector;
    }

    public void setReporter(Reportable reporter){
        reportable = reporter;
    }

    public void detect(){
        detectable.detect();
    }

    public void report(){
        reportable.report();
    }


}
