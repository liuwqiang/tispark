/*
 * Copyright 2017 PingCAP, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pingcap.tikv.txn.type;

import com.google.protobuf.ByteString;
import com.pingcap.tikv.region.TiRegion;
import java.util.ArrayList;
import java.util.List;
import org.tikv.kvproto.Metapb;

public class BatchKeys {
  private List<ByteString> keys;

  private TiRegion region;
  private Metapb.Store store;

  public BatchKeys(TiRegion region, Metapb.Store store, List<ByteString> keysInput) {
    this.region = region;
    this.store = store;
    this.keys = new ArrayList<>();
    this.keys.addAll(keysInput);
  }

  public List<ByteString> getKeys() {
    return keys;
  }

  public void setKeys(List<ByteString> keys) {
    this.keys = keys;
  }

  public TiRegion getRegion() {
    return region;
  }

  public Metapb.Store getStore() {
    return store;
  }
}
