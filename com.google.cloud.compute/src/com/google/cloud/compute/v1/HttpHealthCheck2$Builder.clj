(ns com.google.cloud.compute.v1.HttpHealthCheck2$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheck2$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-request-path
  "The request path of the HTTP health check request. The default value is /.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getRequestPath))))

(defn set-request-path
  "The request path of the HTTP health check request. The default value is /.

  request-path - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String request-path]
    (-> this (.setRequestPath request-path))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#httpHealthCheck for HTTP health checks.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getKind))))

(defn get-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2$Builder this]
    (-> this (.getUnhealthyThreshold))))

(defn set-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  healthy-threshold - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.Integer healthy-threshold]
    (-> this (.setHealthyThreshold healthy-threshold))))

(defn get-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2$Builder this]
    (-> this (.getCheckIntervalSec))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#httpHealthCheck for HTTP health checks.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.Integer timeout-sec]
    (-> this (.setTimeoutSec timeout-sec))))

(defn build
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck2`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2 [^HttpHealthCheck2$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getDescription))))

(defn set-port
  "The TCP port number for the HTTP health check request. The default value is 80.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn set-unhealthy-threshold
  "A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   default value is 2.

  unhealthy-threshold - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.Integer unhealthy-threshold]
    (-> this (.setUnhealthyThreshold unhealthy-threshold))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HttpHealthCheck2`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^com.google.cloud.compute.v1.HttpHealthCheck2 other]
    (-> this (.mergeFrom other))))

(defn set-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the public IP on behalf of which this health check is performed will be used.

  host - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.String host]
    (-> this (.setHost host))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getSelfLink))))

(defn get-port
  "The TCP port number for the HTTP health check request. The default value is 80.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2$Builder this]
    (-> this (.getPort))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this]
    (-> this (.clone))))

(defn get-healthy-threshold
  "A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   default value is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2$Builder this]
    (-> this (.getHealthyThreshold))))

(defn get-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the public IP on behalf of which this health check is performed will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getHost))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck2$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-timeout-sec
  "How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   invalid for timeoutSec to have greater value than checkIntervalSec.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck2$Builder this]
    (-> this (.getTimeoutSec))))

(defn set-check-interval-sec
  "How often (in seconds) to send a health check. The default value is 5 seconds.

  check-interval-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck2$Builder [^HttpHealthCheck2$Builder this ^java.lang.Integer check-interval-sec]
    (-> this (.setCheckIntervalSec check-interval-sec))))

