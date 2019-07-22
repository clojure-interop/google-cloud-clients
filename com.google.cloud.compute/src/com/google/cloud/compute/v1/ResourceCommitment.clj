(ns com.google.cloud.compute.v1.ResourceCommitment
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ResourceCommitment]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ResourceCommitment`

  returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^com.google.cloud.compute.v1.ResourceCommitment prototype]
    (ResourceCommitment/newBuilder prototype))
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder []
    (ResourceCommitment/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ResourceCommitment`"
  (^com.google.cloud.compute.v1.ResourceCommitment []
    (ResourceCommitment/getDefaultInstance )))

(defn get-type
  "Type of resource for which this commitment applies. Possible values are VCPU and MEMORY

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceCommitment this]
    (-> this (.getType))))

(defn get-amount
  "The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this
   can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of
   256 MB, with up to 6.5GB of memory per every vCPU.

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceCommitment this]
    (-> this (.getAmount))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ResourceCommitment this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceCommitment this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ResourceCommitment this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ResourceCommitment this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceCommitment this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceCommitment this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^ResourceCommitment this]
    (-> this (.toBuilder))))

