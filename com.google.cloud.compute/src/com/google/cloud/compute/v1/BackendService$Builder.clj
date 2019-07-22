(ns com.google.cloud.compute.v1.BackendService$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendService$Builder]))

(defn add-all-custom-request-headers
  "Headers that the HTTP/S load balancer should add to proxied requests.

  custom-request-headers - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.util.List custom-request-headers]
    (-> this (.addAllCustomRequestHeaders custom-request-headers))))

(defn set-cdn-policy
  "Cloud CDN configuration for this BackendService.

  cdn-policy - `com.google.cloud.compute.v1.BackendServiceCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^com.google.cloud.compute.v1.BackendServiceCdnPolicy cdn-policy]
    (-> this (.setCdnPolicy cdn-policy))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-affinity-cookie-ttl-sec
  "Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE. If set to 0, the
   cookie is non-persistent and lasts only until the end of the browser session (or equivalent).
   The maximum allowed value for TTL is one day.

   When the load balancing scheme is INTERNAL, this field is not used.

  affinity-cookie-ttl-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.Integer affinity-cookie-ttl-sec]
    (-> this (.setAffinityCookieTtlSec affinity-cookie-ttl-sec))))

(defn add-custom-request-headers
  "Headers that the HTTP/S load balancer should add to proxied requests.

  custom-request-headers - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String custom-request-headers]
    (-> this (.addCustomRequestHeaders custom-request-headers))))

(defn set-region
  "[Output Only] URL of the region where the regional backend service resides. This field is not
   applicable to global backend services. You must specify this field as part of the HTTP
   request URL. It is not settable as a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-session-affinity
  "Type of session affinity to use. The default is NONE.

   When the load balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or GENERATED_COOKIE.

   When the load balancing scheme is INTERNAL, can be NONE, CLIENT_IP, CLIENT_IP_PROTO, or
   CLIENT_IP_PORT_PROTO.

   When the protocol is UDP, this field is not used.

  session-affinity - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String session-affinity]
    (-> this (.setSessionAffinity session-affinity))))

(defn get-session-affinity
  "Type of session affinity to use. The default is NONE.

   When the load balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or GENERATED_COOKIE.

   When the load balancing scheme is INTERNAL, can be NONE, CLIENT_IP, CLIENT_IP_PROTO, or
   CLIENT_IP_PORT_PROTO.

   When the protocol is UDP, this field is not used.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getSessionAffinity))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#backendService for backend services.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getKind))))

(defn set-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a BackendService. An
   up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a BackendService.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a BackendService. An
   up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a BackendService.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getFingerprint))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-health-checks
  "The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
   BackendService. Currently at most one health check can be specified, and a health check is
   required for Compute Engine backend services. A health check must not be specified for App
   Engine backend and Cloud Function backend.

   For internal load balancing, a URL to a HealthCheck resource must be specified instead.

  health-checks - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String health-checks]
    (-> this (.addHealthChecks health-checks))))

(defn set-port-name
  "Name of backend port. The same name should appear in the instance groups referenced by this
   service. Required when the load balancing scheme is EXTERNAL.

   When the load balancing scheme is INTERNAL, this field is not used.

  port-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String port-name]
    (-> this (.setPortName port-name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#backendService for backend services.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-cdn-policy
  "Cloud CDN configuration for this BackendService.

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy [^BackendService$Builder this]
    (-> this (.getCdnPolicy))))

(defn get-affinity-cookie-ttl-sec
  "Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE. If set to 0, the
   cookie is non-persistent and lasts only until the end of the browser session (or equivalent).
   The maximum allowed value for TTL is one day.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService$Builder this]
    (-> this (.getAffinityCookieTtlSec))))

(defn set-iap
  "iap - `com.google.cloud.compute.v1.BackendServiceIAP`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^com.google.cloud.compute.v1.BackendServiceIAP iap]
    (-> this (.setIap iap))))

(defn get-load-balancing-scheme
  "Indicates whether the backend service will be used with internal or external load balancing.
   A backend service created for one type of load balancing cannot be used with the other.
   Possible values are INTERNAL and EXTERNAL.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getLoadBalancingScheme))))

(defn get-enable-cdn?
  "If true, enable Cloud CDN for this BackendService.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendService$Builder this]
    (-> this (.getEnableCDN))))

(defn get-security-policy
  "[Output Only] The resource URL for the security policy associated with this backend service.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getSecurityPolicy))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-health-checks-list
  "The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
   BackendService. Currently at most one health check can be specified, and a health check is
   required for Compute Engine backend services. A health check must not be specified for App
   Engine backend and Cloud Function backend.

   For internal load balancing, a URL to a HealthCheck resource must be specified instead.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendService$Builder this]
    (-> this (.getHealthChecksList))))

(defn get-port-name
  "Name of backend port. The same name should appear in the instance groups referenced by this
   service. Required when the load balancing scheme is EXTERNAL.

   When the load balancing scheme is INTERNAL, this field is not used.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getPortName))))

(defn set-timeout-sec
  "How many seconds to wait for the backend before considering it a failed request. Default is
   30 seconds.

  timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.Integer timeout-sec]
    (-> this (.setTimeoutSec timeout-sec))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendService`"
  (^com.google.cloud.compute.v1.BackendService [^BackendService$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getDescription))))

(defn set-port
  "Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
   80.

   This cannot be used for internal load balancing.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn get-connection-draining
  "returns: `com.google.cloud.compute.v1.ConnectionDraining`"
  (^com.google.cloud.compute.v1.ConnectionDraining [^BackendService$Builder this]
    (-> this (.getConnectionDraining))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^com.google.cloud.compute.v1.BackendService other]
    (-> this (.mergeFrom other))))

(defn get-backends-list
  "The list of backends that serve this BackendService.

  returns: `java.util.List<com.google.cloud.compute.v1.Backend>`"
  (^java.util.List [^BackendService$Builder this]
    (-> this (.getBackendsList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getSelfLink))))

(defn add-all-backends
  "The list of backends that serve this BackendService.

  backends - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.util.List backends]
    (-> this (.addAllBackends backends))))

(defn get-custom-request-headers-list
  "Headers that the HTTP/S load balancer should add to proxied requests.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendService$Builder this]
    (-> this (.getCustomRequestHeadersList))))

(defn add-all-health-checks
  "The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
   BackendService. Currently at most one health check can be specified, and a health check is
   required for Compute Engine backend services. A health check must not be specified for App
   Engine backend and Cloud Function backend.

   For internal load balancing, a URL to a HealthCheck resource must be specified instead.

  health-checks - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.util.List health-checks]
    (-> this (.addAllHealthChecks health-checks))))

(defn get-port
  "Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
   80.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService$Builder this]
    (-> this (.getPort))))

(defn get-iap
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP`"
  (^com.google.cloud.compute.v1.BackendServiceIAP [^BackendService$Builder this]
    (-> this (.getIap))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this]
    (-> this (.clone))))

(defn set-enable-cdn
  "If true, enable Cloud CDN for this BackendService.

   When the load balancing scheme is INTERNAL, this field is not used.

  enable-cdn - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.Boolean enable-cdn]
    (-> this (.setEnableCDN enable-cdn))))

(defn get-protocol
  "The protocol this BackendService uses to communicate with backends.

   Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.

   For internal load balancing, the possible values are TCP and UDP, and the default is TCP.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getProtocol))))

(defn set-security-policy
  "[Output Only] The resource URL for the security policy associated with this backend service.

  security-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String security-policy]
    (-> this (.setSecurityPolicy security-policy))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-protocol
  "The protocol this BackendService uses to communicate with backends.

   Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.

   For internal load balancing, the possible values are TCP and UDP, and the default is TCP.

  protocol - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String protocol]
    (-> this (.setProtocol protocol))))

(defn set-load-balancing-scheme
  "Indicates whether the backend service will be used with internal or external load balancing.
   A backend service created for one type of load balancing cannot be used with the other.
   Possible values are INTERNAL and EXTERNAL.

  load-balancing-scheme - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^java.lang.String load-balancing-scheme]
    (-> this (.setLoadBalancingScheme load-balancing-scheme))))

(defn set-connection-draining
  "connection-draining - `com.google.cloud.compute.v1.ConnectionDraining`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^com.google.cloud.compute.v1.ConnectionDraining connection-draining]
    (-> this (.setConnectionDraining connection-draining))))

(defn add-backends
  "The list of backends that serve this BackendService.

  backends - `com.google.cloud.compute.v1.Backend`

  returns: `com.google.cloud.compute.v1.BackendService$Builder`"
  (^com.google.cloud.compute.v1.BackendService$Builder [^BackendService$Builder this ^com.google.cloud.compute.v1.Backend backends]
    (-> this (.addBackends backends))))

(defn get-timeout-sec
  "How many seconds to wait for the backend before considering it a failed request. Default is
   30 seconds.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BackendService$Builder this]
    (-> this (.getTimeoutSec))))

(defn get-region
  "[Output Only] URL of the region where the regional backend service resides. This field is not
   applicable to global backend services. You must specify this field as part of the HTTP
   request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendService$Builder this]
    (-> this (.getRegion))))

