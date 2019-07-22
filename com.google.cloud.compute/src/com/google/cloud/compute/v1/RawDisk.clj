(ns com.google.cloud.compute.v1.RawDisk
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RawDisk]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RawDisk`

  returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^com.google.cloud.compute.v1.RawDisk prototype]
    (RawDisk/newBuilder prototype))
  (^com.google.cloud.compute.v1.RawDisk$Builder []
    (RawDisk/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RawDisk`"
  (^com.google.cloud.compute.v1.RawDisk []
    (RawDisk/getDefaultInstance )))

(defn get-container-type
  "The format used to encode and transmit the block device, which should be TAR. This is just a
   container and transmission format and not a runtime format. Provided by the client when the
   disk image is created.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk this]
    (-> this (.getContainerType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RawDisk this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RawDisk this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RawDisk this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-source
  "The full Google Cloud Storage URL where the disk image is stored. You must provide either this
   property or the sourceDisk property but not both.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk this]
    (-> this (.getSource))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RawDisk this]
    (-> this (.getApiMessageRequestBody))))

(defn get-sha-1-checksum
  "[Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
   unpackaging provided by the client when the disk image is created.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk this]
    (-> this (.getSha1Checksum))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RawDisk this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RawDisk this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk this]
    (-> this (.toBuilder))))

