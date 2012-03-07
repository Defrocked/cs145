package hw1;

import cs145.s2012A.hw1.Sprite;
import cs145.s2012A.hw1.SpriteAnimator;

public class Story {
	
	public static void main(String[] args) {
		//setup
		SpriteAnimator animator = new SpriteAnimator(1200, 700);
		
		//calls the animation methods
		slideLeftLight(animator);
		slideRightLight(animator);
		spinDiscoBall(animator);
		showClassyDancer(animator);
		showCrazyDancer(animator);
		
		//shows the animator
		animator.show();
	}

	private static void showCrazyDancer(SpriteAnimator animator) {
		//CrazyDancer flips every 2 seconds
		Sprite zeroThroughTwo = new Sprite("crazydanceman.png", 0);
		// Adjust sprite for keyframe 0
		zeroThroughTwo.moveTo(450, 0);
		animator.register(zeroThroughTwo, 0);
		
		// Adjust sprite for keyframe 1.99
		zeroThroughTwo.move(0,0);
		animator.register(zeroThroughTwo, 1.99);
		
		//FLIPS
		Sprite twoThroughFour = new Sprite("crazydanceman2.png", 0);
		// Adjust sprite for keyframe 2
		twoThroughFour.moveTo(450, 0);
		animator.register(twoThroughFour, 2);
		
		// Adjust sprite for keyframe 3.99
		twoThroughFour.move(0,0);
		animator.register(twoThroughFour, 3.99);
		
		//FLIPS
		Sprite fourThroughSix = new Sprite("crazydanceman.png", 0);
		// Adjust sprite for keyframe 4
		fourThroughSix.moveTo(450, 0);
		animator.register(fourThroughSix, 4);
		
		// Adjust sprite for keyframe 5.99
		fourThroughSix.move(0,0);
		animator.register(fourThroughSix, 5.99);
		
		//FLIPS
		Sprite sixThroughEight = new Sprite("crazydanceman2.png", 0);
		// Adjust sprite for keyframe 6
		sixThroughEight.moveTo(450, 0);
		animator.register(sixThroughEight, 6);
		
		// Adjust sprite for keyframe 7.99
		sixThroughEight.move(0,0);
		animator.register(sixThroughEight, 7.99);
		
		//FLIPS
		Sprite eightThroughTen = new Sprite("crazydanceman.png", 0);
		// Adjust sprite for keyframe 8
		eightThroughTen.moveTo(450, 0);
		animator.register(eightThroughTen, 8);
		
		// Adjust sprite for keyframe 9.99
		eightThroughTen.move(0,0);
		animator.register(eightThroughTen, 9.99);
		
		//FLIPS
		Sprite tenThroughTwelve = new Sprite("crazydanceman2.png", 0);
		// Adjust sprite for keyframe 10
		tenThroughTwelve.moveTo(450, 0);
		animator.register(tenThroughTwelve, 10);
		
		// Adjust sprite for keyframe 11.99
		tenThroughTwelve.move(0,0);
		animator.register(tenThroughTwelve, 11.99);
		
		//FLIPS
		Sprite twelveThroughFourteen = new Sprite("crazydanceman.png", 0);
		// Adjust sprite for keyframe 12
		twelveThroughFourteen.moveTo(450, 0);
		animator.register(twelveThroughFourteen, 12);
		
		// Adjust sprite for keyframe 13.99
		twelveThroughFourteen.move(0,0);
		animator.register(twelveThroughFourteen, 13.99);
		
		//FLIPS
		Sprite fourteenThroughSixteen = new Sprite("crazydanceman2.png", 0);
		// Adjust sprite for keyframe 14
		fourteenThroughSixteen.moveTo(450, 0);
		animator.register(fourteenThroughSixteen, 14);
		
		// Adjust sprite for keyframe 15.99
		fourteenThroughSixteen.move(0,0);
		animator.register(fourteenThroughSixteen, 15.99);
		
		//FLIPS
		Sprite sixteenThroughEighteen = new Sprite("crazydanceman.png", 0);
		// Adjust sprite for keyframe 16
		sixteenThroughEighteen.moveTo(450, 0);
		animator.register(sixteenThroughEighteen, 16);
		
		// Adjust sprite for keyframe 17.99
		sixteenThroughEighteen.move(0,0);
		animator.register(sixteenThroughEighteen, 17.99);
		
		//FLIPS ONE LAST TIME
		Sprite eighteenThroughTwenty = new Sprite("crazydanceman2.png", 0);
		// Adjust sprite for keyframe 18
		eighteenThroughTwenty.moveTo(450, 0);
		animator.register(eighteenThroughTwenty, 18);
		
		// Adjust sprite for keyframe 20
		eighteenThroughTwenty.move(0,0);
		animator.register(eighteenThroughTwenty, 20);
	}

	private static void showClassyDancer(SpriteAnimator animator) {
		//ClassyDancer flips every 5 seconds
		Sprite zeroThroughFive = new Sprite("classydanceman.png", 0);
		// Adjust sprite for keyframe 0
		zeroThroughFive.moveTo(750, 0);
		animator.register(zeroThroughFive, 0);

		// Adjust sprite for keyframe 4.99
		zeroThroughFive.move(0, 0);
		animator.register(zeroThroughFive, 4.99);
		
		//FLIPS
		Sprite fiveThroughTen = new Sprite("classydanceman2.png", 5);
		// Adjust sprite for keyframe 5
		fiveThroughTen.moveTo(750, 0);
		animator.register(fiveThroughTen, 5);

		// Adjust sprite for keyframe 9.99
		fiveThroughTen.move(0, 0);
		animator.register(fiveThroughTen, 9.99);
		
		//FLIPS BACK
		Sprite tenThroughFifteen = new Sprite("classydanceman.png", 0);
		// Adjust sprite for keyframe 10
		tenThroughFifteen.moveTo(750, 0);
		animator.register(tenThroughFifteen, 10);

		// Adjust sprite for keyframe 14.99
		tenThroughFifteen.move(0, 0);
		animator.register(tenThroughFifteen, 14.99);
		
		//FLIPS ONE LAST TIME
		Sprite fifteenThroughTwenty = new Sprite("classydanceman2.png", 5);
		// Adjust sprite for keyframe 15
		fifteenThroughTwenty.moveTo(750, 0);
		animator.register(fifteenThroughTwenty, 15);

		// Adjust sprite for keyframe 20
		fifteenThroughTwenty.move(0, 0);
		animator.register(fifteenThroughTwenty, 20);
	}

	private static void spinDiscoBall(SpriteAnimator animator) {
		//Discoball rotates
		Sprite discoBall = new Sprite("discoball.png", 0);
		// Adjust sprite for keyframe 0
		discoBall.move(600, 500);
		animator.register(discoBall, 0);

		// Adjust sprite for keyframe 20
		discoBall.rotate(1440.0);
		animator.register(discoBall, 20);
	}

	private static void slideRightLight(SpriteAnimator animator) {
		//Slides the "lights" from bottom to top and back
		Sprite light = new Sprite("lights.png", 0);
		// Adjust sprite for keyframe 0
		light.move(1050, 0);
		animator.register(light, 0);

		// Adjust sprite for keyframe 2
		light.moveTo(1050, 350);
		animator.register(light, 2);

		// Adjust sprite for keyframe 4
		light.moveTo(1050, 0);
		animator.register(light, 4);

		// Adjust sprite for keyframe 6
		light.moveTo(1050, 350);
		animator.register(light, 6);

		// Adjust sprite for keyframe 8
		light.moveTo(1050, 0);
		animator.register(light, 8);

		// Adjust sprite for keyframe 10
		light.moveTo(1050, 350);
		animator.register(light, 10);

		// Adjust sprite for keyframe 12
		light.moveTo(1050, 0);
		animator.register(light, 12);

		// Adjust sprite for keyframe 14
		light.moveTo(1050, 350);
		animator.register(light, 14);

		// Adjust sprite for keyframe 16
		light.moveTo(1050, 0);
		animator.register(light, 16);

		// Adjust sprite for keyframe 18
		light.moveTo(1050, 350);
		animator.register(light, 18);

		// Adjust sprite for keyframe 20
		light.moveTo(1050, 0);
		animator.register(light, 20);
	}

	private static void slideLeftLight(SpriteAnimator animator) {
		//Slides the "lights" from bottom to top and back
		Sprite light = new Sprite("lights2.png", 0);
		// Adjust sprite for keyframe 0
		light.move(150, 0);
		animator.register(light, 0);

		// Adjust sprite for keyframe 2
		light.moveTo(150, 350);
		animator.register(light, 2);

		// Adjust sprite for keyframe 4
		light.moveTo(150, 0);
		animator.register(light, 4);

		// Adjust sprite for keyframe 6
		light.moveTo(150, 350);
		animator.register(light, 6);

		// Adjust sprite for keyframe 8
		light.moveTo(150, 0);
		animator.register(light, 8);

		// Adjust sprite for keyframe 10
		light.moveTo(150, 350);
		animator.register(light, 10);

		// Adjust sprite for keyframe 12
		light.moveTo(150, 0);
		animator.register(light, 12);

		// Adjust sprite for keyframe 14
		light.moveTo(150, 350);
		animator.register(light, 14);

		// Adjust sprite for keyframe 16
		light.moveTo(150, 0);
		animator.register(light, 16);

		// Adjust sprite for keyframe 18
		light.moveTo(150, 350);
		animator.register(light, 18);

		// Adjust sprite for keyframe 20
		light.moveTo(150, 0);
		animator.register(light, 20);
	}
}
