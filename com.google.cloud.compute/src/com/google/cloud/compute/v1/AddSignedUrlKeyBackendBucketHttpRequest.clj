(ns com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddSignedUrlKeyBackendBucketHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest`

  returns: `com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest$Builder [^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest prototype]
    (AddSignedUrlKeyBackendBucketHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest$Builder []
    (AddSignedUrlKeyBackendBucketHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest`"
  (^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest []
    (AddSignedUrlKeyBackendBucketHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getUserIp))))

(defn get-backend-bucket
  "Name of the BackendBucket resource to which the Signed URL Key should be added. The name should
   conform to RFC1035. It must have the format
   `{project}/global/backendBuckets/{backendBucket}/addSignedUrlKey`. \\`{backendBucket}\\` must
   start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getBackendBucket))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AddSignedUrlKeyBackendBucketHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.SignedUrlKey`"
  (^com.google.cloud.compute.v1.SignedUrlKey [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
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
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getRequestId))))

(defn get-signed-url-key-resource
  "Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs

  returns: `com.google.cloud.compute.v1.SignedUrlKey`"
  (^com.google.cloud.compute.v1.SignedUrlKey [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getSignedUrlKeyResource))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddSignedUrlKeyBackendBucketHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest$Builder [^AddSignedUrlKeyBackendBucketHttpRequest this]
    (-> this (.toBuilder))))

