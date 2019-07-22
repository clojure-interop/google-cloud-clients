(ns com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 StorageRpc$RewriteRequest]))

(defn ->rewrite-request
  "Constructor.

  source - `com.google.api.services.storage.model.StorageObject`
  source-options - `java.util.Map`
  override-info - `boolean`
  target - `com.google.api.services.storage.model.StorageObject`
  target-options - `java.util.Map`
  megabytes-rewritten-per-call - `java.lang.Long`"
  (^StorageRpc$RewriteRequest [^com.google.api.services.storage.model.StorageObject source ^java.util.Map source-options ^Boolean override-info ^com.google.api.services.storage.model.StorageObject target ^java.util.Map target-options ^java.lang.Long megabytes-rewritten-per-call]
    (new StorageRpc$RewriteRequest source source-options override-info target target-options megabytes-rewritten-per-call)))

(defn source
  "Instance Constant.

  type: com.google.api.services.storage.model.StorageObject"
  (^com.google.api.services.storage.model.StorageObject [^StorageRpc$RewriteRequest this]
    (-> this .-source)))

(defn source-options
  "Instance Constant.

  type: java.util.Map<com.google.cloud.storage.spi.v1.StorageRpc$Option,?>"
  (^java.util.Map [^StorageRpc$RewriteRequest this]
    (-> this .-sourceOptions)))

(defn override-info
  "Instance Constant.

  type: boolean"
  (^Boolean [^StorageRpc$RewriteRequest this]
    (-> this .-overrideInfo)))

(defn target
  "Instance Constant.

  type: com.google.api.services.storage.model.StorageObject"
  (^com.google.api.services.storage.model.StorageObject [^StorageRpc$RewriteRequest this]
    (-> this .-target)))

(defn target-options
  "Instance Constant.

  type: java.util.Map<com.google.cloud.storage.spi.v1.StorageRpc$Option,?>"
  (^java.util.Map [^StorageRpc$RewriteRequest this]
    (-> this .-targetOptions)))

(defn megabytes-rewritten-per-call
  "Instance Constant.

  type: java.lang.Long"
  (^java.lang.Long [^StorageRpc$RewriteRequest this]
    (-> this .-megabytesRewrittenPerCall)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StorageRpc$RewriteRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StorageRpc$RewriteRequest this]
    (-> this (.hashCode))))

