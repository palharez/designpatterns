"""
Creational Pattern.

A factory is an object for creating other objects without having to specify the exact class.

When to use?
 Useful when there is some generic processing in a class but the required sub-class
 is dynamically decided at runtime. Or putting it in other words, when the client
 doesn't know what exact sub-class it might need.
"""


class GreekLocalizer:
    """A simple localizer a la gettext"""

    def __init__(self):
        self.translations = {"dog": "σκύλος", "cat": "γάτα"}

    def localize(self, msg):
        """We'll put if we don't have a translation"""
        return self.translations.get(msg, msg)


class EnglishLocalizer:
    """Simplyy echoes the message"""

    def localize(self, msg):
        return msg


def get_localizer(langugage="English"):
    """Factory"""
    localizers = {
        "Enlgish": EnglishLocalizer,
        "Greek": GreekLocalizer
    }

    return localizers[langugage]()


def main():
    greekLocalizer = get_localizer("Greek")
    for msg in "dog parrot cat bear".split():
        print(greekLocalizer.localize(msg))


if __name__ == "__main__":
    main()
