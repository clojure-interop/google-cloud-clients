(ns com.google.cloud.compute.v1.HealthCheck
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheck]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^com.google.cloud.compute.v1.HealthCheck prototype]
    (HealthCheck/newBuilder prototype))
  (^com.google.cloud.compute.v1.HealthCheck$Builder []
    (HealthCheck/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HealthCheck`"
  (^com.google.cloud.compute.v1.HealthCheck []
    (HealthCheck/getDefaultInstance )))

(defn get-tcp-health-check
  "returns: `com.google.cloud.compute.v1.TCPHealthCheck`"
  (^com.google.cloud.compute.v1.TCPHealthCheck [^HealthCheck this]
    (-> this (.getTcpHealthCheck))))

(defn get-type
  "Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not specified,
   the default is TCP. Exactly one of the protocol-specific health check field must be specified,
   which must match type field.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getType))))

(defn get-kind
  "Type of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getKind))))

(defn get-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck this]
    (-> this (.getUnhealthyThreshold))))

(defn get-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck this]
    (-> this (.getCheckIntervalSec))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HealthCheck this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HealthCheck this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getName))))

(defn get-ssl-health-check
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck`"
  (^com.google.cloud.compute.v1.SSLHealthCheck [^HealthCheck this]
    (-> this (.getSslHealthCheck))))

(defn get-https-health-check
  "returns: `com.google.cloud.compute.v1.HttpSHealthCheck`"
  (^com.google.cloud.compute.v1.HttpSHealthCheck [^HealthCheck this]
    (-> this (.getHttpsHealthCheck))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getDescription))))

(defn get-http-2-health-check
  "returns: `com.google.cloud.compute.v1.Http2HealthCheck`"
  (^com.google.cloud.compute.v1.Http2HealthCheck [^HealthCheck this]
    (-> this (.getHttp2HealthCheck))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HealthCheck this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HealthCheck this]
    (-> this (.hashCode))))

(defn get-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck this]
    (-> this (.getHealthyThreshold))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in 3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck this]
    (-> this (.getCreationTimestamp))))

(defn get-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck this]
    (-> this (.getTimeoutSec))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HealthCheck this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-http-health-check
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck`"
  (^com.google.cloud.compute.v1.HttpHealthCheck [^HealthCheck this]
    (-> this (.getHttpHealthCheck))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck this]
    (-> this (.toBuilder))))

