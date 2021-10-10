package OpenDevPj_2021.Chap05.Prac;
abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);

    abstract String delete(String key);

    abstract int length();
}

class Dictionary extends PairMap{
    Dictionary(int arrLength){
        keyArray=new String[arrLength];
        valueArray=new String[arrLength];

        for(int i=0;i<arrLength;i++){
            keyArray[i]="null";
            valueArray[i]="null";
        }
    }
    @Override
    public String get(String key){
        String A="null";
        for(int j=0;j<keyArray.length;j++){
            if(keyArray[j].equals(key)){
                A=valueArray[j];
            }
        }
        return A;
    }
    @Override
    public void put(String key,String value){
        int n;
        for(n=0;n<keyArray.length;n++){
            if(keyArray[n].equals(key)){
                valueArray[n]=value;
                break;
            }
        }
        if(n==keyArray.length){
            int m;
            for(m=0;m< keyArray.length;m++){
                if(keyArray[m].equals("null")){
                    keyArray[m]=key;
                    valueArray[m]=value;
                    break;
                }
            }

            if(m==keyArray.length){
                System.out.println("Dictionary full");
            }
        }
    }
    @Override
    public String delete(String key){
        String s="null";
        for(int i=0;i< keyArray.length;i++){
            if(keyArray[i].equals(key)){
                s=valueArray[i];
                keyArray[i]="null";
                valueArray[i]="null";
            }
        }
        return  s;
    }
    @Override
    public int length(){
        int count=0;
        for(int i=0;i<keyArray.length;i++){
            if(keyArray[i].equals(null));
            else
                count++;
        }
        return count;
    }
}

public class DictionaryApp_10 {
    public static void main(String[] args) {
        Dictionary dic=new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이썬");
        dic.put("이재문","C++");
        System.out.println("이재문의 값은 "+dic.get("이재문") );
        System.out.println("황기태의 값은 "+dic.get("황기태") );
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));

    }
}
