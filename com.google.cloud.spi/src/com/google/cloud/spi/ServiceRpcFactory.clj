(ns com.google.cloud.spi.ServiceRpcFactory
  "A base interface for all service RPC factories. Implementation must provide a public no-arg
  constructor. Loading of a factory implementation is done via ServiceLoader."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spi ServiceRpcFactory]))

(defn create
  "options - `OptionsT`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^ServiceRpcFactory this options]
    (-> this (.create options))))

