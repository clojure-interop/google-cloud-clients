(ns com.google.cloud.compute.v1.GetGlobalOperationHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetGlobalOperationHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetGlobalOperationHttpRequest`

  returns: `com.google.cloud.compute.v1.GetGlobalOperationHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetGlobalOperationHttpRequest$Builder [^com.google.cloud.compute.v1.GetGlobalOperationHttpRequest prototype]
    (GetGlobalOperationHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetGlobalOperationHttpRequest$Builder []
    (GetGlobalOperationHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetGlobalOperationHttpRequest`"
  (^com.google.cloud.compute.v1.GetGlobalOperationHttpRequest []
    (GetGlobalOperationHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetGlobalOperationHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetGlobalOperationHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetGlobalOperationHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetGlobalOperationHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getFields))))

(defn get-operation
  "Name of the Operations resource to return. It must have the format
   `{project}/global/operations/{operation}`. \\`{operation}\\` must start with a letter, and
   contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores
   (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must
   be between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetGlobalOperationHttpRequest this]
    (-> this (.getOperation))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetGlobalOperationHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetGlobalOperationHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetGlobalOperationHttpRequest$Builder [^GetGlobalOperationHttpRequest this]
    (-> this (.toBuilder))))

