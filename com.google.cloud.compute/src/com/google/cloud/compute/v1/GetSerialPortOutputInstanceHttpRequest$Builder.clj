(ns com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetSerialPortOutputInstanceHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn get-instance
  "Name of the instance scoping this request. It must have the format
   `{project}/zones/{zone}/instances/{instance}/serialPort`. \\`{instance}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.build))))

(defn set-port
  "Specifies which COM or serial port to retrieve data from.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn set-instance
  "Name of the instance scoping this request. It must have the format
   `{project}/zones/{zone}/instances/{instance}/serialPort`. \\`{instance}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getPrettyPrint))))

(defn get-port
  "Specifies which COM or serial port to retrieve data from.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getPort))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-start
  "Returns output starting from a specific byte position. Use this to page through output when
   the output is too large to return in a single request. For the initial request, leave this
   field unspecified. For subsequent calls, this field should be set to the next value returned
   in the previous call.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getStart))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSerialPortOutputInstanceHttpRequest$Builder this]
    (-> this (.getFields))))

(defn set-start
  "Returns output starting from a specific byte position. Use this to page through output when
   the output is too large to return in a single request. For the initial request, leave this
   field unspecified. For subsequent calls, this field should be set to the next value returned
   in the previous call.

  start - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest$Builder [^GetSerialPortOutputInstanceHttpRequest$Builder this ^java.lang.String start]
    (-> this (.setStart start))))

