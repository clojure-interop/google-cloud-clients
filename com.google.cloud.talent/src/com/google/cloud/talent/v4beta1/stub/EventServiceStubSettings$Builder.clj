(ns com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder
  "Builder for EventServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub EventServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder [^EventServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^EventServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-client-event-settings
  "Returns the builder for the settings used for calls to createClientEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EventServiceStubSettings$Builder this]
    (-> this (.createClientEventSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings [^EventServiceStubSettings$Builder this]
    (-> this (.build))))

