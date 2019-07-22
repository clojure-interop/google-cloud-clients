(ns com.google.cloud.compute.v1.AcceleratorConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AcceleratorConfig`

  returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^com.google.cloud.compute.v1.AcceleratorConfig prototype]
    (AcceleratorConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder []
    (AcceleratorConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AcceleratorConfig`"
  (^com.google.cloud.compute.v1.AcceleratorConfig []
    (AcceleratorConfig/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AcceleratorConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AcceleratorConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AcceleratorConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AcceleratorConfig this]
    (-> this (.hashCode))))

(defn get-accelerator-count
  "The number of the guest accelerator cards exposed to this instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AcceleratorConfig this]
    (-> this (.getAcceleratorCount))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AcceleratorConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-accelerator-type
  "Full or partial URL of the accelerator type resource to attach to this instance. For example:
   projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating
   an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full
   list of accelerator types.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorConfig this]
    (-> this (.getAcceleratorType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^AcceleratorConfig this]
    (-> this (.toBuilder))))

