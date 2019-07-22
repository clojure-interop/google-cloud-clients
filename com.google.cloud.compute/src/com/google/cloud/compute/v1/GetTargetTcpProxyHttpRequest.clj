(ns com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetTargetTcpProxyHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest`

  returns: `com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest$Builder [^com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest prototype]
    (GetTargetTcpProxyHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest$Builder []
    (GetTargetTcpProxyHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest`"
  (^com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest []
    (GetTargetTcpProxyHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetTargetTcpProxyHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-target-tcp-proxy
  "Name of the TargetTcpProxy resource to return. It must have the format
   `{project}/global/targetTcpProxies/{targetTcpProxy}`. \\`{targetTcpProxy}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getTargetTcpProxy))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetTargetTcpProxyHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetTargetTcpProxyHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetTargetTcpProxyHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest$Builder [^GetTargetTcpProxyHttpRequest this]
    (-> this (.toBuilder))))

