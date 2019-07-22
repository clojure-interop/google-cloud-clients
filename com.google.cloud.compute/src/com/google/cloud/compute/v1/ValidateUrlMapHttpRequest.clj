(ns com.google.cloud.compute.v1.ValidateUrlMapHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ValidateUrlMapHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ValidateUrlMapHttpRequest`

  returns: `com.google.cloud.compute.v1.ValidateUrlMapHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest$Builder [^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest prototype]
    (ValidateUrlMapHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest$Builder []
    (ValidateUrlMapHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ValidateUrlMapHttpRequest`"
  (^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest []
    (ValidateUrlMapHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ValidateUrlMapHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ValidateUrlMapHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-url-map
  "Name of the UrlMap resource to be validated as. It must have the format
   `{project}/global/urlMaps/{urlMap}/validate`. \\`{urlMap}\\` must start with a letter, and
   contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores
   (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must
   be between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getUrlMap))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest [^ValidateUrlMapHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-url-maps-validate-request-resource
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest [^ValidateUrlMapHttpRequest this]
    (-> this (.getUrlMapsValidateRequestResource))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ValidateUrlMapHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ValidateUrlMapHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ValidateUrlMapHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ValidateUrlMapHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest$Builder [^ValidateUrlMapHttpRequest this]
    (-> this (.toBuilder))))

