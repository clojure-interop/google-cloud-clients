(ns com.google.cloud.compute.v1.TCPHealthCheck
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TCPHealthCheck]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TCPHealthCheck`

  returns: `com.google.cloud.compute.v1.TCPHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.TCPHealthCheck$Builder [^com.google.cloud.compute.v1.TCPHealthCheck prototype]
    (TCPHealthCheck/newBuilder prototype))
  (^com.google.cloud.compute.v1.TCPHealthCheck$Builder []
    (TCPHealthCheck/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TCPHealthCheck`"
  (^com.google.cloud.compute.v1.TCPHealthCheck []
    (TCPHealthCheck/getDefaultInstance )))

(defn get-response
  "The bytes to match against the beginning of the response data. If left empty (the default
   value), any response will indicate health. The response data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.getResponse))))

(defn get-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, TCP health check follows behavior specified in port and portName fields.

  returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.getPortSpecification))))

(defn get-request
  "The application data to send once the TCP connection has been established (default value is
   empty). If both request and response are empty, the connection establishment alone will
   indicate health. The request data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.getRequest))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TCPHealthCheck this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TCPHealthCheck this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.getPortName))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE or
   PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TCPHealthCheck this]
    (-> this (.getProxyHeader))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TCPHealthCheck this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "The TCP port number for the health check request. The default value is 80. Valid values are 1
   through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^TCPHealthCheck this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TCPHealthCheck this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TCPHealthCheck this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TCPHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.TCPHealthCheck$Builder [^TCPHealthCheck this]
    (-> this (.toBuilder))))

