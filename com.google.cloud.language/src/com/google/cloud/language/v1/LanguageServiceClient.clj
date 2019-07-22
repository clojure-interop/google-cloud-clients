(ns com.google.cloud.language.v1.LanguageServiceClient
  "Service Description: Provides text analysis operations such as sentiment analysis and entity
  recognition.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
    Document document = Document.newBuilder().build();
    EncodingType encodingType = EncodingType.NONE;
    AnalyzeSentimentResponse response = languageServiceClient.analyzeSentiment(document, encodingType);
  }

  Note: close() needs to be called on the languageServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of LanguageServiceSettings to
  create(). For example:

  To customize credentials:



  LanguageServiceSettings languageServiceSettings =
      LanguageServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  LanguageServiceClient languageServiceClient =
      LanguageServiceClient.create(languageServiceSettings);

  To customize the endpoint:



  LanguageServiceSettings languageServiceSettings =
      LanguageServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  LanguageServiceClient languageServiceClient =
      LanguageServiceClient.create(languageServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1 LanguageServiceClient]))

(defn *create
  "Constructs an instance of LanguageServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.language.v1.LanguageServiceSettings`

  returns: `com.google.cloud.language.v1.LanguageServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.language.v1.LanguageServiceClient [^com.google.cloud.language.v1.LanguageServiceSettings settings]
    (LanguageServiceClient/create settings))
  (^com.google.cloud.language.v1.LanguageServiceClient []
    (LanguageServiceClient/create )))

(defn analyze-sentiment
  "Analyzes the sentiment of the provided text.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     EncodingType encodingType = EncodingType.NONE;
     AnalyzeSentimentResponse response = languageServiceClient.analyzeSentiment(document, encodingType);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`
  encoding-type - The encoding type used by the API to calculate sentence offsets. - `com.google.cloud.language.v1.EncodingType`

  returns: `com.google.cloud.language.v1.AnalyzeSentimentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.AnalyzeSentimentResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.EncodingType encoding-type]
    (-> this (.analyzeSentiment document encoding-type)))
  (^com.google.cloud.language.v1.AnalyzeSentimentResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document]
    (-> this (.analyzeSentiment document))))

(defn get-settings
  "returns: `com.google.cloud.language.v1.LanguageServiceSettings`"
  (^com.google.cloud.language.v1.LanguageServiceSettings [^LanguageServiceClient this]
    (-> this (.getSettings))))

(defn analyze-sentiment-callable
  "Analyzes the sentiment of the provided text.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnalyzeSentimentRequest request = AnalyzeSentimentRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<AnalyzeSentimentResponse> future = languageServiceClient.analyzeSentimentCallable().futureCall(request);
     // Do something
     AnalyzeSentimentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.AnalyzeSentimentRequest,com.google.cloud.language.v1.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.analyzeSentimentCallable))))

(defn analyze-syntax
  "Analyzes the syntax of the text and provides sentence boundaries and tokenization along with
   part of speech tags, dependency trees, and other properties.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     EncodingType encodingType = EncodingType.NONE;
     AnalyzeSyntaxResponse response = languageServiceClient.analyzeSyntax(document, encodingType);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`
  encoding-type - The encoding type used by the API to calculate offsets. - `com.google.cloud.language.v1.EncodingType`

  returns: `com.google.cloud.language.v1.AnalyzeSyntaxResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.AnalyzeSyntaxResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.EncodingType encoding-type]
    (-> this (.analyzeSyntax document encoding-type)))
  (^com.google.cloud.language.v1.AnalyzeSyntaxResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document]
    (-> this (.analyzeSyntax document))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.language.v1.stub.LanguageServiceStub`"
  ([^LanguageServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^LanguageServiceClient this]
    (-> this (.isShutdown))))

(defn classify-text
  "Classifies a document into categories.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     ClassifyTextResponse response = languageServiceClient.classifyText(document);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`

  returns: `com.google.cloud.language.v1.ClassifyTextResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.ClassifyTextResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document]
    (-> this (.classifyText document))))

(defn analyze-syntax-callable
  "Analyzes the syntax of the text and provides sentence boundaries and tokenization along with
   part of speech tags, dependency trees, and other properties.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnalyzeSyntaxRequest request = AnalyzeSyntaxRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<AnalyzeSyntaxResponse> future = languageServiceClient.analyzeSyntaxCallable().futureCall(request);
     // Do something
     AnalyzeSyntaxResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.AnalyzeSyntaxRequest,com.google.cloud.language.v1.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.analyzeSyntaxCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^LanguageServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^LanguageServiceClient this]
    (-> this (.shutdown))))

(defn analyze-entities-callable
  "Finds named entities (currently proper names and common nouns) in the text along with entity
   types, salience, mentions for each entity, and other properties.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnalyzeEntitiesRequest request = AnalyzeEntitiesRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<AnalyzeEntitiesResponse> future = languageServiceClient.analyzeEntitiesCallable().futureCall(request);
     // Do something
     AnalyzeEntitiesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.AnalyzeEntitiesRequest,com.google.cloud.language.v1.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.analyzeEntitiesCallable))))

(defn analyze-entities
  "Finds named entities (currently proper names and common nouns) in the text along with entity
   types, salience, mentions for each entity, and other properties.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     EncodingType encodingType = EncodingType.NONE;
     AnalyzeEntitiesResponse response = languageServiceClient.analyzeEntities(document, encodingType);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`
  encoding-type - The encoding type used by the API to calculate offsets. - `com.google.cloud.language.v1.EncodingType`

  returns: `com.google.cloud.language.v1.AnalyzeEntitiesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.AnalyzeEntitiesResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.EncodingType encoding-type]
    (-> this (.analyzeEntities document encoding-type)))
  (^com.google.cloud.language.v1.AnalyzeEntitiesResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document]
    (-> this (.analyzeEntities document))))

(defn analyze-entity-sentiment-callable
  "Finds entities, similar to
   [AnalyzeEntities][google.cloud.language.v1.LanguageService.AnalyzeEntities] in the text and
   analyzes sentiment associated with each entity and its mentions.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnalyzeEntitySentimentRequest request = AnalyzeEntitySentimentRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<AnalyzeEntitySentimentResponse> future = languageServiceClient.analyzeEntitySentimentCallable().futureCall(request);
     // Do something
     AnalyzeEntitySentimentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.analyzeEntitySentimentCallable))))

(defn annotate-text
  "A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and
   analyzeSyntax provide in one call.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();
     EncodingType encodingType = EncodingType.NONE;
     AnnotateTextResponse response = languageServiceClient.annotateText(document, features, encodingType);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`
  features - The enabled features. - `com.google.cloud.language.v1.AnnotateTextRequest$Features`
  encoding-type - The encoding type used by the API to calculate offsets. - `com.google.cloud.language.v1.EncodingType`

  returns: `com.google.cloud.language.v1.AnnotateTextResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.AnnotateTextResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.AnnotateTextRequest$Features features ^com.google.cloud.language.v1.EncodingType encoding-type]
    (-> this (.annotateText document features encoding-type)))
  (^com.google.cloud.language.v1.AnnotateTextResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.AnnotateTextRequest$Features features]
    (-> this (.annotateText document features)))
  (^com.google.cloud.language.v1.AnnotateTextResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.AnnotateTextRequest request]
    (-> this (.annotateText request))))

(defn close
  ""
  ([^LanguageServiceClient this]
    (-> this (.close))))

(defn classify-text-callable
  "Classifies a document into categories.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     ClassifyTextRequest request = ClassifyTextRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<ClassifyTextResponse> future = languageServiceClient.classifyTextCallable().futureCall(request);
     // Do something
     ClassifyTextResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.ClassifyTextRequest,com.google.cloud.language.v1.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.classifyTextCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^LanguageServiceClient this]
    (-> this (.isTerminated))))

(defn annotate-text-callable
  "A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and
   analyzeSyntax provide in one call.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();
     AnnotateTextRequest request = AnnotateTextRequest.newBuilder()
       .setDocument(document)
       .setFeatures(features)
       .build();
     ApiFuture<AnnotateTextResponse> future = languageServiceClient.annotateTextCallable().futureCall(request);
     // Do something
     AnnotateTextResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1.AnnotateTextRequest,com.google.cloud.language.v1.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceClient this]
    (-> this (.annotateTextCallable))))

(defn shutdown-now
  ""
  ([^LanguageServiceClient this]
    (-> this (.shutdownNow))))

(defn analyze-entity-sentiment
  "Finds entities, similar to
   [AnalyzeEntities][google.cloud.language.v1.LanguageService.AnalyzeEntities] in the text and
   analyzes sentiment associated with each entity and its mentions.

   Sample code:



   try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
     Document document = Document.newBuilder().build();
     EncodingType encodingType = EncodingType.NONE;
     AnalyzeEntitySentimentResponse response = languageServiceClient.analyzeEntitySentiment(document, encodingType);
   }

  document - Input document. - `com.google.cloud.language.v1.Document`
  encoding-type - The encoding type used by the API to calculate offsets. - `com.google.cloud.language.v1.EncodingType`

  returns: `com.google.cloud.language.v1.AnalyzeEntitySentimentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.language.v1.AnalyzeEntitySentimentResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document ^com.google.cloud.language.v1.EncodingType encoding-type]
    (-> this (.analyzeEntitySentiment document encoding-type)))
  (^com.google.cloud.language.v1.AnalyzeEntitySentimentResponse [^LanguageServiceClient this ^com.google.cloud.language.v1.Document document]
    (-> this (.analyzeEntitySentiment document))))

