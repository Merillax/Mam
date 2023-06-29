package com.example.myapplication;
import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
//Класс для работы с апи
//12.04.2023
//Peristov Dmitrii
public class Authenticator implements Interceptor {
    SessionManager sessionManager;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        builder.addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiZmZlYWJkYTgxMGRiZTJmZjVhYzBmMjgyYzUyZjQzMjA3MWZlMjBkN2U1NzkzY2RiY2U1ZTk2ODhiMjE3Y2VhYWFjMzRjZDAxNmU3MGU3YWQiLCJpYXQiOjE2ODEzODkwNjUuODEzNjYsIm5iZiI6MTY4MTM4OTA2NS44MTM2NjcsImV4cCI6MTcxMzAxMTQ2NS44MDc3MjcsInN1YiI6IjMwIiwic2NvcGVzIjpbXX0.miorsCd-tvGt1gbNtAvrjmvXYtWjNxMHOkpvxWL_g7gPrDHU1CHnED9BB0Utdz5bS782W_wxWYKkXhduOjz2lGP5liytZb9VX3fo-vNEvjEDPkXZpZ3fEM3KOFSggclZCRB7Ss3DIK2jfsM-7jxqGwk0vB2x9Nq6PF9ZfBI703QLwyxf3Acbp1KBaJBlexHR3AgmQIqv3mIBeg6DWhb6WyeSvGwtF8Fi--ZSekKvcpox0b8DqDEujliLTd_T7OHIOeDqh40GfIkU2pPltXLeXFY-CpL3Vj4e1r1td76194OP0wFOcEptt3c51TME479_F1ZmProbcEXc1QBmNcCN11U5g7grzsbpRLIMp1LvPLnEw9i6dDHTySCpG9n6TWFzjfI2dI92nhJlCgqPeW5RITdxlFSgeFE5S78rx2J5Hzz1S6hEmB4utn5kMfqKeY5797j0XIR2_qCezKKHfCbCXgTMmYPo22yCY5ta-q1Zlshso5Tb_5zyk1uCoLOTo6miL5GPKIWXI5Pf5ZdCk5nf5jfJSRGDrAi7q-y4AyZ13-DPdAkLZQ7vyxPqC1Q7bUJBQtZTzkwoIVOhzNeIHG7adCwF9Wn5v9QcoKT8YeKGOs6MjiY8LquIWLb-09yJ2fshTbV81BLUk8XVLT6OpHEWpzY9h6UTZEXHE173eBoJzLU");
        return chain.proceed(builder.build());
    }
}

