package com.crayon.fieldapp.data.remote;

import java.lang.System;

/**
 * Identifies the error type which triggered a [BaseException]
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/crayon/fieldapp/data/remote/ErrorType;", "", "(Ljava/lang/String;I)V", "NETWORK", "HTTP", "SERVER", "UNEXPECTED", "app_debug"})
public enum ErrorType {
    /*public static final*/ NETWORK /* = new NETWORK() */,
    /*public static final*/ HTTP /* = new HTTP() */,
    /*public static final*/ SERVER /* = new SERVER() */,
    /*public static final*/ UNEXPECTED /* = new UNEXPECTED() */;
    
    ErrorType() {
    }
}