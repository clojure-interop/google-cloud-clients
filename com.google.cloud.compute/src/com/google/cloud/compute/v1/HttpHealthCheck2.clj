(ns com.google.cloud.compute.v1.HttpHealthCheck2
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheck2]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HttpHealthCheck2`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^com.google.cloud.compute.v1.HttpHealthCheck2 prototype]
    (HttpHealthCheck2/newBuilder prototype))
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder []
    (HttpHealthCheck2/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck2`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2 []
    (HttpHealthCheck2/getDefaultInstance )))

(defn get-request-path
  "The request path of the HTTP health check request. The default value is /.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getRequestPath))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#httpHealthCheck for HTTP health checks.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getKind))))

(defn get-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2 this]
    (-> this (.getUnhealthyThreshold))))

(defn get-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2 this]
    (-> this (.getCheckIntervalSec))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HttpHealthCheck2 this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HttpHealthCheck2 this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HttpHealthCheck2 this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getSelfLink))))

(defn get-port
  "The TCP port number for the HTTP health check request. The default value is 80.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2 this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HttpHealthCheck2 this]
    (-> this (.hashCode))))

(defn get-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2 this]
    (-> this (.getHealthyThreshold))))

(defn get-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the public IP on behalf of which this health check is performed will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getHost))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2 this]
    (-> this (.getCreationTimestamp))))

(defn get-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2 this]
    (-> this (.getTimeoutSec))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HttpHealthCheck2 this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2 this]
    (-> this (.toBuilder))))

