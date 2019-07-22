(ns com.google.cloud.compute.v1.SSLHealthCheck$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SSLHealthCheck$Builder]))

(defn get-response
  "The bytes to match against the beginning of the response data. If left empty (the default
   value), any response will indicate health. The response data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck$Builder this]
    (-> this (.getResponse))))

(defn set-request
  "The application data to send once the SSL connection has been established (default value is
   empty). If both request and response are empty, the connection establishment alone will
   indicate health. The request data can only be ASCII.

  request - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.String request]
    (-> this (.setRequest request))))

(defn get-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, SSL health check follows behavior specified in port and portName fields.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck$Builder this]
    (-> this (.getPortSpecification))))

(defn set-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, SSL health check follows behavior specified in port and portName fields.

  port-specification - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.String port-specification]
    (-> this (.setPortSpecification port-specification))))

(defn get-request
  "The application data to send once the SSL connection has been established (default value is
   empty). If both request and response are empty, the connection establishment alone will
   indicate health. The request data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck$Builder this]
    (-> this (.getRequest))))

(defn set-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  port-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.String port-name]
    (-> this (.setPortName port-name))))

(defn get-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck$Builder this]
    (-> this (.getPortName))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck$Builder this]
    (-> this (.getProxyHeader))))

(defn build
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck`"
  (^com.google.cloud.compute.v1.SSLHealthCheck [^SSLHealthCheck$Builder this]
    (-> this (.build))))

(defn set-port
  "The TCP port number for the health check request. The default value is 443. Valid values are
   1 through 65535.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn set-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  proxy-header - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.String proxy-header]
    (-> this (.setProxyHeader proxy-header))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SSLHealthCheck`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^com.google.cloud.compute.v1.SSLHealthCheck other]
    (-> this (.mergeFrom other))))

(defn set-response
  "The bytes to match against the beginning of the response data. If left empty (the default
   value), any response will indicate health. The response data can only be ASCII.

  response - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this ^java.lang.String response]
    (-> this (.setResponse response))))

(defn get-port
  "The TCP port number for the health check request. The default value is 443. Valid values are
   1 through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^SSLHealthCheck$Builder this]
    (-> this (.getPort))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck$Builder this]
    (-> this (.clone))))

