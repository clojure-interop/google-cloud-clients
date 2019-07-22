(ns com.google.cloud.compute.v1.SerialPortOutput
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SerialPortOutput]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SerialPortOutput`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^com.google.cloud.compute.v1.SerialPortOutput prototype]
    (SerialPortOutput/newBuilder prototype))
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder []
    (SerialPortOutput/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SerialPortOutput`"
  (^com.google.cloud.compute.v1.SerialPortOutput []
    (SerialPortOutput/getDefaultInstance )))

(defn get-next
  "[Output Only] The position of the next byte of content from the serial console output. Use this
   value in the next request as the start parameter.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.getNext))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SerialPortOutput this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SerialPortOutput this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SerialPortOutput this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SerialPortOutput this]
    (-> this (.hashCode))))

(defn get-start
  "The starting byte position of the output that was returned. This should match the start
   parameter sent with the request. If the serial console output exceeds the size of the buffer,
   older output will be overwritten by newer content and the start values will be mismatched.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.getStart))))

(defn get-contents
  "[Output Only] The contents of the console output.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput this]
    (-> this (.getContents))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SerialPortOutput this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput this]
    (-> this (.toBuilder))))

