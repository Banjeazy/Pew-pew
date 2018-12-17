// ну неплохо неплохо, только можно сделать два класса. 
// один типа раннер с public static void main методом (далее - psvm)
// второй будет утилитный класс к примеру с этим методом 


public class Bub {   // можно дать более красивое имя типа BubbleSorter - но опять таки можно - и лучше - в отдельный класс вынести
    
    static void bubbleSort(int arr[]) { // давай на той же строке пиши фигурную скобку, это не си))
        int n = arr.length;
        int temp = 0;
        
        for (int i = 0; i < n ; i++)
            
            for (int j = 1; j < (n - i); j++)
                
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
    }
    
    
    public static void main(String[] args) {
        int arr[] = {5,8,2,9,4,6,1,3,7};
        
        System.out.println("Before"); // уже наверн можно познакомиться с логгерами типа log4j
        
        for(int i = 0; i < arr.length; i++) {  // в идеи можно нажать ctrl + alt + L  - автоформат
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        bubbleSort(arr);
        
        System.out.println("After");
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
