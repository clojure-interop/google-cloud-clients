(ns com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetSerialPortOutputInstanceHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest prototype]
    (GetSerialPortOutputInstanceHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder []
    (GetSerialPortOutputInstanceHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest []
    (GetSerialPortOutputInstanceHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetSerialPortOutputInstanceHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "Name of the instance scoping this request. It must have the format
   `{project}/zones/{zone}/instances/{instance}/serialPort`. \\`{instance}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getInstance))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn get-port
  "Specifies which COM or serial port to retrieve data from.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.hashCode))))

(defn get-start
  "Returns output starting from a specific byte position. Use this to page through output when the
   output is too large to return in a single request. For the initial request, leave this field
   unspecified. For subsequent calls, this field should be set to the next value returned in the
   previous call.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getStart))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetSerialPortOutputInstanceHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest this]
    (-> this (.toBuilder))))

