(ns com.google.cloud.logging.HttpRequest
  "Objects of this class represent information about the (optional) HTTP request associated with a
  log entry."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging HttpRequest]))

(defn *new-builder
  "Returns a builder for HttpRequest objects.

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder []
    (HttpRequest/newBuilder )))

(defn get-request-url
  "Returns the requested URL. Request URL contains the scheme (http, https), the
   host name, the path and the query portion of the URL that was requested. Example: http://example.com/some/info?color=red.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.getRequestUrl))))

(defn get-request-size
  "Returns the size of the HTTP request message in bytes, including the request headers and the
   request body.

  returns: `java.lang.Long`"
  (^java.lang.Long [^HttpRequest this]
    (-> this (.getRequestSize))))

(defn get-referer
  "Returns the referer URL of the request, as defined in HTTP/1.1 Header Field Definitions.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.getReferer))))

(defn get-server-ip
  "Returns the IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   Examples: 192.168.1.1, FE80::0202:B3FF:FE1E:8329.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.getServerIp))))

(defn get-status
  "Returns the response code indicating the status of response.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HttpRequest this]
    (-> this (.getStatus))))

(defn cache-hit
  "Returns whether or not an entity was served from cache (with or without validation). If not
   set, this method returns false.

  returns: `boolean`"
  (^Boolean [^HttpRequest this]
    (-> this (.cacheHit))))

(defn get-user-agent
  "Returns the user agent sent by the client. Example: Mozilla/4.0 (compatible; MSIE 6.0;
   Windows 98; Q312461; .NET CLR 1.0.3705).

  returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.getUserAgent))))

(defn get-cache-fill-bytes
  "Returns the number of HTTP response bytes inserted into cache. Set only when a cache fill was
   attempted.

  returns: `java.lang.Long`"
  (^java.lang.Long [^HttpRequest this]
    (-> this (.getCacheFillBytes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.toString))))

(defn get-remote-ip
  "Returns the IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples:
   192.168.1.1, FE80::0202:B3FF:FE1E:8329.

  returns: `java.lang.String`"
  (^java.lang.String [^HttpRequest this]
    (-> this (.getRemoteIp))))

(defn cache-lookup
  "Returns whether or not a cache lookup was attempted. If not set, this method returns false.

  returns: `boolean`"
  (^Boolean [^HttpRequest this]
    (-> this (.cacheLookup))))

(defn get-latency
  "Returns the processing latency on the server, from the time the request was received until the
   response was sent.

  returns: the latency, for null if not populated. - `org.threeten.bp.Duration`"
  (^org.threeten.bp.Duration [^HttpRequest this]
    (-> this (.getLatency))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HttpRequest this]
    (-> this (.hashCode))))

(defn get-request-method
  "Returns the HTTP request method.

  returns: `com.google.cloud.logging.HttpRequest$RequestMethod`"
  (^com.google.cloud.logging.HttpRequest$RequestMethod [^HttpRequest this]
    (-> this (.getRequestMethod))))

(defn cache-validated-with-origin-server
  "Returns whether or not the response was validated with the origin server before being served
   from cache. If not set, this method returns false. This field is only meaningful if
   cacheHit() is set to true.

  returns: `boolean`"
  (^Boolean [^HttpRequest this]
    (-> this (.cacheValidatedWithOriginServer))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HttpRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-response-size
  "Returns the size of the HTTP response message sent back to the client, in bytes, including the
   response headers and the response body.

  returns: `java.lang.Long`"
  (^java.lang.Long [^HttpRequest this]
    (-> this (.getResponseSize))))

(defn to-builder
  "Returns a builder for this object.

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest this]
    (-> this (.toBuilder))))

