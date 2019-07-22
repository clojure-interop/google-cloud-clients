(ns com.google.cloud.logging.HttpRequest$Builder
  "A builder for HttpRequest objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging HttpRequest$Builder]))

(defn set-latency
  "Sets the latency on the server, from the time the request was received until the response was
   sent.

  latency - `org.threeten.bp.Duration`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^org.threeten.bp.Duration latency]
    (-> this (.setLatency latency))))

(defn set-cache-lookup
  "Sets whether or not a cache lookup was attempted. If not set, false is used.

  cache-lookup - `boolean`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Boolean cache-lookup]
    (-> this (.setCacheLookup cache-lookup))))

(defn set-request-url
  "Sets the requested URL. Request URL contains the scheme (http, https), the
   host name, the path and the query portion of the URL that was requested. Example: http://example.com/some/info?color=red.

  request-url - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^java.lang.String request-url]
    (-> this (.setRequestUrl request-url))))

(defn set-cache-validated-with-origin-server
  "Sets whether or not the response was validated with the origin server before being served
   from cache. This field is only meaningful if setCacheHit(boolean) is set to true. If not set, false is used.

  cache-validated-with-origin-server - `boolean`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Boolean cache-validated-with-origin-server]
    (-> this (.setCacheValidatedWithOriginServer cache-validated-with-origin-server))))

(defn build
  "Creates a HttpRequest object for this builder.

  returns: `com.google.cloud.logging.HttpRequest`"
  (^com.google.cloud.logging.HttpRequest [^HttpRequest$Builder this]
    (-> this (.build))))

(defn set-remote-ip
  "Sets the IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples:
   192.168.1.1, FE80::0202:B3FF:FE1E:8329.

  remote-ip - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^java.lang.String remote-ip]
    (-> this (.setRemoteIp remote-ip))))

(defn set-user-agent
  "Sets the user agent sent by the client. Example: Mozilla/4.0 (compatible; MSIE 6.0;
   Windows 98; Q312461; .NET CLR 1.0.3705).

  user-agent - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^java.lang.String user-agent]
    (-> this (.setUserAgent user-agent))))

(defn set-request-size
  "Sets the size of the HTTP request message in bytes, including the request headers and the
   request body.

  request-size - `long`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Long request-size]
    (-> this (.setRequestSize request-size))))

(defn set-request-method
  "Sets the HTTP request method.

  request-method - `com.google.cloud.logging.HttpRequest$RequestMethod`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^com.google.cloud.logging.HttpRequest$RequestMethod request-method]
    (-> this (.setRequestMethod request-method))))

(defn set-server-ip
  "Sets the IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   Examples: 192.168.1.1, FE80::0202:B3FF:FE1E:8329.

  server-ip - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^java.lang.String server-ip]
    (-> this (.setServerIp server-ip))))

(defn set-referer
  "Sets the referer URL of the request, as defined in HTTP/1.1 Header Field Definitions.

  referer - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^java.lang.String referer]
    (-> this (.setReferer referer))))

(defn set-response-size
  "Sets the size of the HTTP response message sent back to the client, in bytes, including the
   response headers and the response body.

  response-size - `long`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Long response-size]
    (-> this (.setResponseSize response-size))))

(defn set-cache-fill-bytes
  "Sets the number of HTTP response bytes inserted into cache. Set only when a cache fill was
   attempted.

  cache-fill-bytes - `long`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Long cache-fill-bytes]
    (-> this (.setCacheFillBytes cache-fill-bytes))))

(defn set-cache-hit
  "Sets whether or not an entity was served from cache (with or without validation). If not set,
   false is used.

  cache-hit - `boolean`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Boolean cache-hit]
    (-> this (.setCacheHit cache-hit))))

(defn set-status
  "Sets the response code indicating the status of response.

  status - `int`

  returns: `com.google.cloud.logging.HttpRequest$Builder`"
  (^com.google.cloud.logging.HttpRequest$Builder [^HttpRequest$Builder this ^Integer status]
    (-> this (.setStatus status))))

