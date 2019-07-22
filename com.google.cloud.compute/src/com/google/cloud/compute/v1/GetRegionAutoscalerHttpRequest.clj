(ns com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetRegionAutoscalerHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest`

  returns: `com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest$Builder [^com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest prototype]
    (GetRegionAutoscalerHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest$Builder []
    (GetRegionAutoscalerHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest`"
  (^com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest []
    (GetRegionAutoscalerHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetRegionAutoscalerHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-autoscaler
  "Name of the autoscaler to return. It must have the format
   `{project}/regions/{region}/autoscalers/{autoscaler}`. \\`{autoscaler}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getAutoscaler))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetRegionAutoscalerHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionAutoscalerHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetRegionAutoscalerHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest$Builder [^GetRegionAutoscalerHttpRequest this]
    (-> this (.toBuilder))))

