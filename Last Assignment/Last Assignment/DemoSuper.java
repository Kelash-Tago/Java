class Box{
	private double width;
	private double height;
	private double depth;
	Box(double w, double h, double d){
			width=w;
			height=h;
			depth=d;
			}
	Box(){
		width=-1;
		height=-1;
		depth=-1;
		}
	double volume(){
			return width*height*depth;
		}
	}
class BoxWeight extends Box{
		double weight;
		BoxWeight(double w , double h, double d, double m){
				super(w,h,d);
				weight=m;
				}
		BoxWeight(){
			super();
				weight=-1;
			}
	}
class DemoSuper {
		public static void main (String args[]){
				BoxWeight mybox1= new BoxWeight(10,20,15,34.5);
				double vol;
				vol=mybox1.volume();
				System.out.println("volume of mybox1 is "+ vol);
				System.out.println("weight of mybox1 is " + mybox1.weight);
			}
		}
	