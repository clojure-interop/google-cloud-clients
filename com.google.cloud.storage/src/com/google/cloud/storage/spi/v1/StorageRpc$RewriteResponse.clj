(ns com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 StorageRpc$RewriteResponse]))

(defn ->rewrite-response
  "Constructor.

  rewrite-request - `com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest`
  result - `com.google.api.services.storage.model.StorageObject`
  blob-size - `long`
  is-done - `boolean`
  rewrite-token - `java.lang.String`
  total-bytes-rewritten - `long`"
  (^StorageRpc$RewriteResponse [^com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest rewrite-request ^com.google.api.services.storage.model.StorageObject result ^Long blob-size ^Boolean is-done ^java.lang.String rewrite-token ^Long total-bytes-rewritten]
    (new StorageRpc$RewriteResponse rewrite-request result blob-size is-done rewrite-token total-bytes-rewritten)))

(defn rewrite-request
  "Instance Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest"
  (^com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest [^StorageRpc$RewriteResponse this]
    (-> this .-rewriteRequest)))

(defn result
  "Instance Constant.

  type: com.google.api.services.storage.model.StorageObject"
  (^com.google.api.services.storage.model.StorageObject [^StorageRpc$RewriteResponse this]
    (-> this .-result)))

(defn blob-size
  "Instance Constant.

  type: long"
  (^Long [^StorageRpc$RewriteResponse this]
    (-> this .-blobSize)))

(defn is-done
  "Instance Constant.

  type: boolean"
  (^Boolean [^StorageRpc$RewriteResponse this]
    (-> this .-isDone)))

(defn rewrite-token
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^StorageRpc$RewriteResponse this]
    (-> this .-rewriteToken)))

(defn total-bytes-rewritten
  "Instance Constant.

  type: long"
  (^Long [^StorageRpc$RewriteResponse this]
    (-> this .-totalBytesRewritten)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StorageRpc$RewriteResponse this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StorageRpc$RewriteResponse this]
    (-> this (.hashCode))))

