(ns com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerClient$ListDevicesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DeviceManagerClient$ListDevicesPagedResponse/createAsync context future-response)))

