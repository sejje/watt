(ns steam.tf-promos-205790 (:require [steam.request :as r]))

(def
 item-id-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :promoid - The promo ID to grant an item for"
 (partial r/get "ITFPromos_205790" "GetItemID" 1))

(def item-id item-id-v1)

(def
 grant-item-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :promoid - The promo ID to grant an item for"
 (partial r/post "ITFPromos_205790" "GrantItem" 1))

(def grant-item grant-item-v1)
