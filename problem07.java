//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.

import stanford.karel.*;

public class problem07 extends Karel {
	public void run() {
//		fillLINE
//      While nextLineExists
//			moveToNextLineStart		
//			fillline		
	}
		private void moveToNextLineStart() {
			turnLeft();
			move();
			turnLeft();
			while (frontIsClear())
				move();
		}
		turnAround();
	}

		
		
		
		
		
	private void  fillLine(){
		while (leftIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		if
	}
	}
}
