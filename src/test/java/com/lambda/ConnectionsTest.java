package com.lambda;

import com.lambda.connections.LambdaFilter;
import com.lambda.connections.LambdaForEach;
import com.lambda.connections.LambdaMap;
import com.lambda.connections.LambdaToList;

/**
 * @author sophie-lish
 */
public class ConnectionsTest {
    public static void main(String[] args) {
        LambdaForEach.main(args);
        LambdaFilter.main(args);
        LambdaToList.main(args);
        LambdaMap.main(args);
    }
}
