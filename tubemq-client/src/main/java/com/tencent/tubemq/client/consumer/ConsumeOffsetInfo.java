/*
 * Tencent is pleased to support the open source community by making TubeMQ available.
 *
 * Copyright (C) 2012-2019 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.tubemq.client.consumer;

import com.tencent.tubemq.corebase.TBaseConstants;
import com.tencent.tubemq.corebase.TokenConstants;


public class ConsumeOffsetInfo {
    private String partitionKey;
    private long currOffset = TBaseConstants.META_VALUE_UNDEFINED;

    public ConsumeOffsetInfo(String partitionKey, Long currOffset) {
        this.partitionKey = partitionKey;
        if (currOffset != null) {
            this.currOffset = currOffset;
        }
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public long getCurrOffset() {
        return currOffset;
    }

    public String toString() {
        return this.partitionKey + TokenConstants.SEGMENT_SEP + this.currOffset;
    }
}
