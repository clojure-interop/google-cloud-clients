(ns com.google.cloud.compute.v1.HealthCheck$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheck$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-https-health-check
  "https-health-check - `com.google.cloud.compute.v1.HttpSHealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.HttpSHealthCheck https-health-check]
    (-> this (.setHttpsHealthCheck https-health-check))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in 3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-tcp-health-check
  "returns: `com.google.cloud.compute.v1.TCPHealthCheck`"
  (^com.google.cloud.compute.v1.TCPHealthCheck [^HealthCheck$Builder this]
    (-> this (.getTcpHealthCheck))))

(defn get-type
  "Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not
   specified, the default is TCP. Exactly one of the protocol-specific health check field must
   be specified, which must match type field.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getType))))

(defn set-http-health-check
  "http-health-check - `com.google.cloud.compute.v1.HttpHealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.HttpHealthCheck http-health-check]
    (-> this (.setHttpHealthCheck http-health-check))))

(defn get-kind
  "Type of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getKind))))

(defn get-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck$Builder this]
    (-> this (.getUnhealthyThreshold))))

(defn set-type
  "Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not
   specified, the default is TCP. Exactly one of the protocol-specific health check field must
   be specified, which must match type field.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn set-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  healthy-threshold - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.Integer healthy-threshold]
    (-> this (.setHealthyThreshold healthy-threshold))))

(defn get-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck$Builder this]
    (-> this (.getCheckIntervalSec))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "Type of the resource.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.Integer timeout-sec]
    (-> this (.setTimeoutSec timeout-sec))))

(defn get-ssl-health-check
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck`"
  (^com.google.cloud.compute.v1.SSLHealthCheck [^HealthCheck$Builder this]
    (-> this (.getSslHealthCheck))))

(defn get-https-health-check
  "returns: `com.google.cloud.compute.v1.HttpSHealthCheck`"
  (^com.google.cloud.compute.v1.HttpSHealthCheck [^HealthCheck$Builder this]
    (-> this (.getHttpsHealthCheck))))

(defn build
  "returns: `com.google.cloud.compute.v1.HealthCheck`"
  (^com.google.cloud.compute.v1.HealthCheck [^HealthCheck$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getDescription))))

(defn set-ssl-health-check
  "ssl-health-check - `com.google.cloud.compute.v1.SSLHealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.SSLHealthCheck ssl-health-check]
    (-> this (.setSslHealthCheck ssl-health-check))))

(defn set-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  unhealthy-threshold - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.Integer unhealthy-threshold]
    (-> this (.setUnhealthyThreshold unhealthy-threshold))))

(defn get-http-2-health-check
  "returns: `com.google.cloud.compute.v1.Http2HealthCheck`"
  (^com.google.cloud.compute.v1.Http2HealthCheck [^HealthCheck$Builder this]
    (-> this (.getHttp2HealthCheck))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.HealthCheck other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this]
    (-> this (.clone))))

(defn get-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck$Builder this]
    (-> this (.getHealthyThreshold))))

(defn set-tcp-health-check
  "tcp-health-check - `com.google.cloud.compute.v1.TCPHealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.TCPHealthCheck tcp-health-check]
    (-> this (.setTcpHealthCheck tcp-health-check))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in 3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthCheck$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthCheck$Builder this]
    (-> this (.getTimeoutSec))))

(defn set-http-2-health-check
  "http-2-health-check - `com.google.cloud.compute.v1.Http2HealthCheck`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^com.google.cloud.compute.v1.Http2HealthCheck http-2-health-check]
    (-> this (.setHttp2HealthCheck http-2-health-check))))

(defn get-http-health-check
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck`"
  (^com.google.cloud.compute.v1.HttpHealthCheck [^HealthCheck$Builder this]
    (-> this (.getHttpHealthCheck))))

(defn set-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  check-interval-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HealthCheck$Builder [^HealthCheck$Builder this ^java.lang.Integer check-interval-sec]
    (-> this (.setCheckIntervalSec check-interval-sec))))

