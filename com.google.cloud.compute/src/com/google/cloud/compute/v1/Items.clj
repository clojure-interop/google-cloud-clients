(ns com.google.cloud.compute.v1.Items
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Items]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Items`

  returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^com.google.cloud.compute.v1.Items prototype]
    (Items/newBuilder prototype))
  (^com.google.cloud.compute.v1.Items$Builder []
    (Items/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Items`"
  (^com.google.cloud.compute.v1.Items []
    (Items/getDefaultInstance )))

(defn get-key
  "Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be
   less than 128 bytes in length. This is reflected as part of a URL in the metadata server.
   Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the
   project.

  returns: `java.lang.String`"
  (^java.lang.String [^Items this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Items this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Items this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Items this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-value
  "Value for the metadata entry. These are free-form strings, and only have meaning as interpreted
   by the image running in the instance. The only restriction placed on values is that their size
   must be less than or equal to 262144 bytes (256 KiB).

  returns: `java.lang.String`"
  (^java.lang.String [^Items this]
    (-> this (.getValue))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Items this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Items this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Items this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^Items this]
    (-> this (.toBuilder))))

