(ns com.google.cloud.compute.v1.SerialPortOutput$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SerialPortOutput$Builder]))

(defn get-next
  "[Output Only] The position of the next byte of content from the serial console output. Use
   this value in the next request as the start parameter.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput$Builder this]
    (-> this (.getNext))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput$Builder this]
    (-> this (.getKind))))

(defn set-contents
  "[Output Only] The contents of the console output.

  contents - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^java.lang.String contents]
    (-> this (.setContents contents))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-next
  "[Output Only] The position of the next byte of content from the serial console output. Use
   this value in the next request as the start parameter.

  next - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^java.lang.String next]
    (-> this (.setNext next))))

(defn build
  "returns: `com.google.cloud.compute.v1.SerialPortOutput`"
  (^com.google.cloud.compute.v1.SerialPortOutput [^SerialPortOutput$Builder this]
    (-> this (.build))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SerialPortOutput`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^com.google.cloud.compute.v1.SerialPortOutput other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this]
    (-> this (.clone))))

(defn get-start
  "The starting byte position of the output that was returned. This should match the start
   parameter sent with the request. If the serial console output exceeds the size of the buffer,
   older output will be overwritten by newer content and the start values will be mismatched.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput$Builder this]
    (-> this (.getStart))))

(defn get-contents
  "[Output Only] The contents of the console output.

  returns: `java.lang.String`"
  (^java.lang.String [^SerialPortOutput$Builder this]
    (-> this (.getContents))))

(defn set-start
  "The starting byte position of the output that was returned. This should match the start
   parameter sent with the request. If the serial console output exceeds the size of the buffer,
   older output will be overwritten by newer content and the start values will be mismatched.

  start - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput$Builder`"
  (^com.google.cloud.compute.v1.SerialPortOutput$Builder [^SerialPortOutput$Builder this ^java.lang.String start]
    (-> this (.setStart start))))

