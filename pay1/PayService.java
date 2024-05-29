package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount){
        Pay[] pays = {new KakaoPay(), new NaverPay()};
        boolean result = false;

        System.out.println("결제를 시작합니다: option="+option+", amount="+amount);

        for(Pay pay : pays){
            if(pay.isPay(option)){
                result = pay.pay(amount);
                break;
            }
        }

        if(result){
            System.out.println("결제가 성공했습니다.");
        }
        else{
            System.out.println("결제에 실패했습니다.");
        }
    }
}
