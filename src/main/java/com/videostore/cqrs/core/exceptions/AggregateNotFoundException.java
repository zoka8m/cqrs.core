/*
 * Copyright (c) 2024 Zorica Maneva. This source file can not be copied and/or distributed without the express
 * written permission of Zorica Maneva. Any unauthorized use is subject to criminal prosecution.
 */

package com.videostore.cqrs.core.exceptions;

/**
 * @author Created by Maneva.
 * @since 1.7.24.
 */
public class AggregateNotFoundException extends RuntimeException {
    public AggregateNotFoundException(final String message) {
        super(message);
    }
}
