(ns com.google.cloud.compute.v1.SSLHealthCheck
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SSLHealthCheck]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SSLHealthCheck`

  returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^com.google.cloud.compute.v1.SSLHealthCheck prototype]
    (SSLHealthCheck/newBuilder prototype))
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder []
    (SSLHealthCheck/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck`"
  (^com.google.cloud.compute.v1.SSLHealthCheck []
    (SSLHealthCheck/getDefaultInstance )))

(defn get-response
  "The bytes to match against the beginning of the response data. If left empty (the default
   value), any response will indicate health. The response data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.getResponse))))

(defn get-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, SSL health check follows behavior specified in port and portName fields.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.getPortSpecification))))

(defn get-request
  "The application data to send once the SSL connection has been established (default value is
   empty). If both request and response are empty, the connection establishment alone will
   indicate health. The request data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.getRequest))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SSLHealthCheck this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SSLHealthCheck this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.getPortName))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE or
   PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^SSLHealthCheck this]
    (-> this (.getProxyHeader))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SSLHealthCheck this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "The TCP port number for the health check request. The default value is 443. Valid values are 1
   through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^SSLHealthCheck this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SSLHealthCheck this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SSLHealthCheck this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SSLHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.SSLHealthCheck$Builder [^SSLHealthCheck this]
    (-> this (.toBuilder))))

