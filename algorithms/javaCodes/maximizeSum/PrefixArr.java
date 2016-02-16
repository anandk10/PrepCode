package maximizeSum;

import java.util.Comparator;

class PrefixArr{
	long ele; int index;

    PrefixArr(long ele, int ind){
        this.ele = ele; this.index = ind;
    }
}

class PrefixArrComp implements Comparator<PrefixArr>{
	@Override
	public int compare(PrefixArr arg0, PrefixArr arg1) {
		// TODO Auto-generated method stub
		if (arg0.ele < arg1.ele)
			return -1;
		else if(arg0.ele > arg1.ele)
			return 1;
		return 0;
	}
}