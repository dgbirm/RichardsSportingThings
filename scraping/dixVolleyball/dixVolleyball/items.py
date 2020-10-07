# Define here the models for your scraped items
#
# See documentation in:
# https://docs.scrapy.org/en/latest/topics/items.html

import scrapy
from scrapy.item import Item, Field


class DixvolleyballItem(scrapy.Item):
    # define the fields for your item here like:
    gender = Field()
    productId = Field()
    productName = Field()
    price = Field()

    #item for comany name
    imageLink = Field()
    productLink = Field()

    pass

class ImgData(Item):

    #image pipline items to download product images
    image_urls=Field()
    images=Field()

