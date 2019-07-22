(ns com.google.cloud.compute.v1.BackendService
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendService]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^com.google.cloud.compute.v1.BackendService prototype]
    (BackendService/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendService$Builder []
    (BackendService/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendService`"
  (^com.google.cloud.compute.v1.BackendService []
    (BackendService/getDefaultInstance )))

(defn get-session-affinity
  "Type of session affinity to use. The default is NONE.

   When the load balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or GENERATED_COOKIE.

   When the load balancing scheme is INTERNAL, can be NONE, CLIENT_IP, CLIENT_IP_PROTO, or
   CLIENT_IP_PORT_PROTO.

   When the protocol is UDP, this field is not used.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getSessionAffinity))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#backendService for backend services.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getKind))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   in optimistic locking. This field will be ignored when inserting a BackendService. An
   up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a BackendService.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendService this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.toString))))

(defn get-cdn-policy
  "Cloud CDN configuration for this BackendService.

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy [^BackendService this]
    (-> this (.getCdnPolicy))))

(defn get-affinity-cookie-ttl-sec
  "Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE. If set to 0, the cookie
   is non-persistent and lasts only until the end of the browser session (or equivalent). The
   maximum allowed value for TTL is one day.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService this]
    (-> this (.getAffinityCookieTtlSec))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendService this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-load-balancing-scheme
  "Indicates whether the backend service will be used with internal or external load balancing. A
   backend service created for one type of load balancing cannot be used with the other. Possible
   values are INTERNAL and EXTERNAL.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getLoadBalancingScheme))))

(defn get-enable-cdn?
  "If true, enable Cloud CDN for this BackendService.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendService this]
    (-> this (.getEnableCDN))))

(defn get-security-policy
  "[Output Only] The resource URL for the security policy associated with this backend service.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getSecurityPolicy))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getName))))

(defn get-health-checks-list
  "The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
   BackendService. Currently at most one health check can be specified, and a health check is
   required for Compute Engine backend services. A health check must not be specified for App
   Engine backend and Cloud Function backend.

   For internal load balancing, a URL to a HealthCheck resource must be specified instead.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendService this]
    (-> this (.getHealthChecksList))))

(defn get-port-name
  "Name of backend port. The same name should appear in the instance groups referenced by this
   service. Required when the load balancing scheme is EXTERNAL.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getPortName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getDescription))))

(defn get-connection-draining
  "returns: `com.google.cloud.compute.v1.ConnectionDraining`"
  (^com.google.cloud.compute.v1.ConnectionDraining [^BackendService this]
    (-> this (.getConnectionDraining))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendService this]
    (-> this (.getApiMessageRequestBody))))

(defn get-backends-list
  "The list of backends that serve this BackendService.

  returns: `java.util.List<com.google.cloud.compute.v1.Backend>`"
  (^java.util.List [^BackendService this]
    (-> this (.getBackendsList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getSelfLink))))

(defn get-custom-request-headers-list
  "Headers that the HTTP/S load balancer should add to proxied requests.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendService this]
    (-> this (.getCustomRequestHeadersList))))

(defn get-port
  "Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
   80.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService this]
    (-> this (.getPort))))

(defn get-iap
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP`"
  (^com.google.cloud.compute.v1.BackendServiceIAP [^BackendService this]
    (-> this (.getIap))))

(defn get-protocol
  "The protocol this BackendService uses to communicate with backends.

   Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.

   For internal load balancing, the possible values are TCP and UDP, and the default is TCP.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getProtocol))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendService this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getCreationTimestamp))))

(defn get-timeout-sec
  "How many seconds to wait for the backend before considering it a failed request. Default is 30
   seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService this]
    (-> this (.getTimeoutSec))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendService this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the regional backend service resides. This field is not
   applicable to global backend services. You must specify this field as part of the HTTP request
   URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService this]
    (-> this (.toBuilder))))

