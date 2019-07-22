(ns com.google.cloud.compute.v1.GetRouteHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetRouteHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetRouteHttpRequest`

  returns: `com.google.cloud.compute.v1.GetRouteHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRouteHttpRequest$Builder [^com.google.cloud.compute.v1.GetRouteHttpRequest prototype]
    (GetRouteHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetRouteHttpRequest$Builder []
    (GetRouteHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetRouteHttpRequest`"
  (^com.google.cloud.compute.v1.GetRouteHttpRequest []
    (GetRouteHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetRouteHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetRouteHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetRouteHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn get-route
  "Name of the Route resource to return. It must have the format
   `{project}/global/routes/{route}`. \\`{route}\\` must start with a letter, and contain only
   letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods
   (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and
   255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getRoute))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetRouteHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRouteHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetRouteHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetRouteHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRouteHttpRequest$Builder [^GetRouteHttpRequest this]
    (-> this (.toBuilder))))

