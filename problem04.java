import stanford.karel.*;
/*კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას პირველი ქუჩა ბრილიანტებით. ანუ პირველი
ქუჩის ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყის
სამყაროში ბრილიანტები არსად არ დევს.
*/
public class problem04 extends Karel{
	public void run() {
		
		while(frontIsClear()){
			putBeeper();
				move();
		
				putBeeper();
		}
	}}
