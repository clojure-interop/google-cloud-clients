(ns com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DeleteHttpHealthCheckHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest`

  returns: `com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest$Builder [^com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest prototype]
    (DeleteHttpHealthCheckHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest$Builder []
    (DeleteHttpHealthCheckHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest`"
  (^com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest []
    (DeleteHttpHealthCheckHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DeleteHttpHealthCheckHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn get-request-id
  "An optional request ID to identify requests. Specify a unique request ID so that if you must
   retry your request, the server will know to ignore the request if it has already been
   completed.

   For example, consider a situation where you make an initial request and the request times
   out. If you make the request again with the same request ID, the server can check if original
   operation with the same request ID was received, and if so, will ignore the second request.
   This prevents clients from accidentally creating duplicate commitments.

   The request ID must be a valid UUID with the exception that zero UUID is not supported
   (00000000-0000-0000-0000-000000000000).

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getRequestId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeleteHttpHealthCheckHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-http-health-check
  "Name of the HttpHealthCheck resource to delete. It must have the format
   `{project}/global/httpHealthChecks/{httpHealthCheck}`. \\`{httpHealthCheck}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.getHttpHealthCheck))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest$Builder [^DeleteHttpHealthCheckHttpRequest this]
    (-> this (.toBuilder))))

