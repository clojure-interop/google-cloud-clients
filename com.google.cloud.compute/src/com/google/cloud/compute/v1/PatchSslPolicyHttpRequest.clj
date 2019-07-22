(ns com.google.cloud.compute.v1.PatchSslPolicyHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PatchSslPolicyHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.PatchSslPolicyHttpRequest`

  returns: `com.google.cloud.compute.v1.PatchSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest$Builder [^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest prototype]
    (PatchSslPolicyHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest$Builder []
    (PatchSslPolicyHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.PatchSslPolicyHttpRequest`"
  (^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest []
    (PatchSslPolicyHttpRequest/getDefaultInstance )))

(defn get-ssl-policy
  "Name of the SSL policy to update. The name must be 1-63 characters long, and comply with
   RFC1035. It must have the format `{project}/global/sslPolicies/{sslPolicy}`. \\`{sslPolicy}\\`
   must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getSslPolicy))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getUserIp))))

(defn get-ssl-policy-resource
  "A SSL policy specifies the server-side support for SSL features. This can be attached to a
   TargetHttpsProxy or a TargetSslProxy. This affects connections between clients and the HTTPS or
   SSL proxy load balancer. They do not affect the connection between the load balancers and the
   backends.

  returns: `com.google.cloud.compute.v1.SslPolicy`"
  (^com.google.cloud.compute.v1.SslPolicy [^PatchSslPolicyHttpRequest this]
    (-> this (.getSslPolicyResource))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only those
   fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PatchSslPolicyHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^PatchSslPolicyHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.SslPolicy`"
  (^com.google.cloud.compute.v1.SslPolicy [^PatchSslPolicyHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
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
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getRequestId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PatchSslPolicyHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchSslPolicyHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PatchSslPolicyHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.PatchSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest$Builder [^PatchSslPolicyHttpRequest this]
    (-> this (.toBuilder))))

