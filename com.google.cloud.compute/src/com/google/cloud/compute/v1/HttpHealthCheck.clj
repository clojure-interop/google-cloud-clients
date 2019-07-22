(ns com.google.cloud.compute.v1.HttpHealthCheck
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheck]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HttpHealthCheck`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^com.google.cloud.compute.v1.HttpHealthCheck prototype]
    (HttpHealthCheck/newBuilder prototype))
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder []
    (HttpHealthCheck/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck`"
  (^com.google.cloud.compute.v1.HttpHealthCheck []
    (HttpHealthCheck/getDefaultInstance )))

(defn get-response
  "The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   default value), the status code determines health. The response data can only be ASCII.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getResponse))))

(defn get-request-path
  "The request path of the HTTP health check request. The default value is /.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getRequestPath))))

(defn get-port-specification
  "Specifies how port is selected for health checking, can be one of following values:
   USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   specified for each network endpoint is used for health checking. For other backends, the port
   or named port specified in the Backend Service is used for health checking.

   If not specified, HTTP health check follows behavior specified in port and portName fields.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getPortSpecification))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HttpHealthCheck this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HttpHealthCheck this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-port-name
  "Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   port takes precedence.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getPortName))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE or
   PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getProxyHeader))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HttpHealthCheck this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "The TCP port number for the health check request. The default value is 80. Valid values are 1
   through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpHealthCheck this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HttpHealthCheck this]
    (-> this (.hashCode))))

(defn get-host
  "The value of the host header in the HTTP health check request. If left empty (default value),
   the IP on behalf of which this health check is performed will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpHealthCheck this]
    (-> this (.getHost))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HttpHealthCheck this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HttpHealthCheck$Builder`"
  (^com.google.cloud.compute.v1.HttpHealthCheck$Builder [^HttpHealthCheck this]
    (-> this (.toBuilder))))

