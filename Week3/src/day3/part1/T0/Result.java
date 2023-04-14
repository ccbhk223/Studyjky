package day3.part1.T0;

/**
 * ccb
 **/

enum Result {
    succeed(200, "一切ok"), error1(404, "资源找不到");
    public int code;
    public String mess;

    Result(int code, String mess) {
        this.code = code;
        this.mess = mess;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", mess='" + mess + '\'' +
                '}';
    }
}

class Results{
    Result result;

    public Results(Result result) {
        this.result = result;
    }


}

class Test{
    public static void main(String[] args) {
        Result result = Result.error1;
        Result result1 = Result.succeed;
        System.out.println(result);
        System.out.println(result1);
        System.out.println("_____");
        Results results = new Results(result);
        System.out.println(results.result);
    }
}
