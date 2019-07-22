(ns com.google.cloud.compute.v1.HttpHealthCheck$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheck$Builder]))

(defn get-response
  "The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   default value), the status code determines health. The response data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getResponse))))

(defn get-request-path
  "The request path of the HTTP health check request. The default value is /.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getRequestPath))))

(defn get-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, HTTP health check follows behavior specified in port and portName
   fields.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getPortSpecification))))

(defn set-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, HTTP health check follows behavior specified in port and portName
   fields.

  port-specification - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String port-specification]
    (-> this (.setPortSpecification port-specification))))

(defn set-request-path
  "The request path of the HTTP health check request. The default value is /.

  request-path - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String request-path]
    (-> this (.setRequestPath request-path))))

(defn set-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  port-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String port-name]
    (-> this (.setPortName port-name))))

(defn get-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getPortName))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getProxyHeader))))

(defn build
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck`"
  (^com.google.cloud.compute.v1.HttpHealthCheck [^HttpHealthCheck$Builder this]
    (-> this (.build))))

(defn set-port
  "The TCP port number for the health check request. The default value is 80. Valid values are 1
   through 65535.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn set-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  proxy-header - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String proxy-header]
    (-> this (.setProxyHeader proxy-header))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HttpHealthCheck`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^com.google.cloud.compute.v1.HttpHealthCheck other]
    (-> this (.mergeFrom other))))

(defn set-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the IP on behalf of which this health check is performed will be used.

  host - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String host]
    (-> this (.setHost host))))

(defn set-response
  "The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   default value), the status code determines health. The response data can only be ASCII.

  response - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this ^java.lang.String response]
    (-> this (.setResponse response))))

(defn get-port
  "The TCP port number for the health check request. The default value is 80. Valid values are 1
   through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck$Builder this]
    (-> this (.getPort))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck$Builder this]
    (-> this (.clone))))

(defn get-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the IP on behalf of which this health check is performed will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck$Builder this]
    (-> this (.getHost))))

