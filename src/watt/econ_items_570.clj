(ns watt.econ-items-570 (:require [watt.core :refer [request]]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial request "GET" "IEconItems_570" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v1
 "Parameters:
:language (string) - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial request "GET" "IEconItems_570" "GetSchema" 1))

(def schema schema-v1)

(def
 schema-url-v1
 (partial request "GET" "IEconItems_570" "GetSchemaURL" 1))

(def schema-url schema-url-v1)

(def
 store-meta-data-v1
 "Parameters:
:language (string) - The language to results in. (optional)"
 (partial request "GET" "IEconItems_570" "GetStoreMetaData" 1))

(def store-meta-data store-meta-data-v1)
